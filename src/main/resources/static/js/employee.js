
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
			
		var href = $(this).attr('href');
		
		$.get(href, function(employee, status){
			$('#idEdit').val(employee.id);
			$('#cpfEdit').val(employee.cpf);
			$('#nameEdit').val(employee.name);
			$('#addressEdit').val(employee.address);
			$('#nationalityEdit').val(employee.nationality);
			$('#professionEdit').val(employee.profession);
			$('#sexEdit').val(employee.sex);
			$('#phoneEdit').val(employee.phone);
			$('#birthdayEdit').val(employee.birthday);
			$('#activeEdit').val(employee.active);
		});					
		$('#editModal').modal();
	});
	
	$('table #deleteButton').on('click', function(event){
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$('#confirmDeleteButton').attr('href', href);
		
		$('#deleteModal').modal();
	});
		
});