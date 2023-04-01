function showTable(){
	$('#customerTable').empty();
	$.getJSON('http://localhost:8080/customer', function(json) {
				var tr=[];
				tr.push('<thead>');
				tr.push('<tr>');
				tr.push('<th>ID</th>');
				tr.push('<th>Name</th>');
				tr.push('<th>Email</th>');
				tr.push('<th>Address</th>');
				tr.push('<th>Action</th>');
				tr.push('</tr>');
				tr.push('</thead>');
				tr.push('<tbody id="customers">');
				for (var i = 0; i < json.length; i++) {
				tr.push('<tr>');
				tr.push('<td>' + json[i].id + '</td>');
				tr.push('<td>' + json[i].name + '</td>');
				tr.push('<td>' + json[i].email + '</td>');
				tr.push('<td>' + json[i].address + '</td>');
				
				tr.push('<td><a class=\'edit\'><span class="btn btn-outline-primary">Edit</span></a>&nbsp;|&nbsp;<a class=\'delete\' id=' + json[i].id + '><span class="btn btn-outline-danger">Delete</span></a></td>');
				tr.push('</tr>');
			}
			$('#customerTable').append($(tr.join('')));
		});
	}

function sukses(){
		$("#msg").html("<span style='color: green'>Customer added successfully</span>");
		$("#input-form").hide();
		setTimeout(function() {
			$("#addModal").modal('hide');
			$('#name').val('');
			$('#email').val('');
			$('#address').val('');
			$("#msg").html("");
		}, 1000);
		setTimeout(function() {
			$("#input-form").show();
		}, 1500);
		showTable();
}

$(document).ready(function() {
	showTable();
			
			$("#addButton").click(function() {
				$("#addModal").modal('show');
			});
			$("#closeModal").click(function() {
				$("#addModal").modal('hide');
			});
			
			$("#search").on("keyup", function() {
    			var value = $(this).val().toLowerCase();
    			$("#customers tr").filter(function() {
     			$(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    			});
  			});
  			
	$(document).delegate('#addNew', 'click', function(event) {
		event.preventDefault();
		var name = $('#name').val();
		var email = $('#email').val();
		var address = $('#address').val();
		
		if (name == "" || email == "" || address == "") {
					$("#msg").html("<span style='color: red'>Data cannot be null</span>");
				}
				
		if (name != "" && email != "" && address != "") {
			$.ajax({
					type: "POST",
					contentType: "application/json; charset=utf-8",
					url: "http://localhost:8080/customer/save",
					data: JSON.stringify(
						{ 'name': name, 'email': email, 'address': address }),
					/*data: JSON.stringify(customer),*/
					cache: false,
					success: sukses,
					error: function(err) {
						$("#msg").html("<span style='color: red'>Data cannot be null</span>");
					}
				});
				}
			});
			
	$(document).delegate('.delete', 'click', function() {
		if (confirm('Are you sure you want to delete this data?')) {
			var id = $(this).attr('id');
			var parent = $(this).parent()
				.parent();
			$.ajax({
				type: "DELETE",
				url: "http://localhost:8080/customer/delete/" + id,
				cache: false,
				success: function() {
					parent.fadeOut(
						'slow', function() {
							$(this).remove();
						});
					location.reload(true)
				},
				error: function() {
					$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error deleting record')
						.fadeIn()
						.fadeOut(4000, function() {
							$(this).remove();
						});
				}
			});
		}
	});

	$(document).delegate('.edit', 'click', function() {
		var parent = $(this).parent().parent();
		var id = parent.children("td:nth-child(1)");
		var name = parent.children("td:nth-child(2)");
		var email = parent.children("td:nth-child(3)");
		var address = parent.children("td:nth-child(4)");
		var buttons = parent.children("td:nth-child(5)");

		name.html("<input type='text' id='name' value='" + name.html() + "'/>");
		email.html("<input type='text' id='email' value='" + email.html() + "'/>");
		address.html("<input type='text' id='address' value='" + address.html() + "'/>");
		
		buttons.html("<a id='save'><span class='btn btn-outline-success my-2 my-sm-0'>Save</span></a>&nbsp;|&nbsp;<a class='delete' id='" + id.html() + "'><span class='btn btn-outline-danger'>Delete</span></a>");
	});

	$(document).delegate('#save', 'click', function() {
		var parent = $(this).parent().parent();
		var id = parent.children("td:nth-child(1)");
		var name = parent.children("td:nth-child(2)");
		var email = parent.children("td:nth-child(3)");
		var address = parent.children("td:nth-child(4)");
		var buttons = parent.children("td:nth-child(5)");

		$.ajax({
			type: "POST",
			contentType: "application/json; charset=utf-8",
			url: "http://localhost:8080/customer/save",
			data: JSON.stringify({
				'id': id.html(),
				'name': name.children("input[type=text]").val(),
				'email': email.children("input[type=text]").val(),
				'address': address.children("input[type=text]").val()
			}),
			cache: false,
			success: function() {
				name.html(name.children("input[type=text]").val());
				email.html(email.children("input[type=text]").val());
				address.html(address.children("input[type=text]").val());
				
				buttons.html("<a class='edit' id='" + id.html() + "'><span class='btn btn-outline-primary'>Edit</span></a>&nbsp;|&nbsp;<a class='delete' id='" + id.html() + "'><span class='btn btn-outline-danger'>Delete</span></a>");

			},
			error: function() {
				$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error updating record')
					.fadeIn()
					.fadeOut(4000, function() {
						$(this).remove();
					});
			}
		});
	});

});