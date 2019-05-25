
function isValidFormItem()
{
	if($.trim($("#txtCusName").val())=="")
	{ return "enter Customer name"; }
	return "true/false";
}

//--items   save/update
$(document).on("click","#btnSave",function()
{
			var result = isValidFormItem();
			if(result=="true")
				{ $("#formItems").submit(); }
			
			else
				{ $("#divStsMsgItem").html(result); }
				
});

//--edit
$(document).on("click","#btnEdit",function()
{
	$("#email").val(update);
	$("#cusName").val($(this).attr("param"));
	$("#Description").val($(this).closest("tr").find('td:eq(1)').text());
	
	
});
//--Remove
$(document).on("click","#btnRemove", function()
{
	$("#email").val("remove");
	$("#cusName").val($(this).attr("param"));
	var res = confirm("are you sure?");
		if(res == true){
			$("#formItems").submit();
		}


});
