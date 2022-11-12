<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jqGrid Demos</title>

<link rel="stylesheet" type="text/css" media="screen"
	href="http://trirand.com/blog/jqgrid/themes/redmond/jquery-ui-1.8.1.custom.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="http://trirand.com/blog/jqgrid/themes/ui.jqgrid.css" />
<link rel="stylesheet" type="text/css" media="screen"
	href="http://trirand.com/blog/jqgrid/themes/ui.multiselect.css" />

<script src="http://trirand.com/blog/jqgrid/js/jquery.js"
	type="text/javascript"></script>
<script
	src="http://trirand.com/blog/jqgrid/js/jquery-ui-1.8.1.custom.min.js"
	type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.layout.js"
	type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/i18n/grid.locale-en.js"
	type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/ui.multiselect.js"
	type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.jqGrid.min.js"
	type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.tablednd.js"
	type="text/javascript"></script>
<script src="http://trirand.com/blog/jqgrid/js/jquery.contextmenu.js"
	type="text/javascript"></script>

<script type="text/javascript">
	jQuery(document).ready(
			function() {

				var template_int = {
					formatter : 'int',
					align : 'center',
					sorttype : 'int'
				};
				var template_float = {
					formatter : 'float',
					align : 'right',
					sorttype : 'float'
				};
				var template_date = {
					align : 'center',
					sorttype : 'date'
				};

				var col_names = [ 'NUM', 'TITLE', 'CONTENT', 'NAME', 'REG_DATE'];
				var col_model = [ {
					name : 'num',
					index : 'num',
					width : 80,
					template : template_int
				}, {
					name : 'title',
					index : 'title',
					width : 90,
					formatter:setLinkFn
				}, {
					name : 'content',
					index : 'content',
					width : 100
				}, {
					name : 'name',
					index : 'name',
					width : 80
				}, {
					name : 'regDate',
					index : 'regDate',
					width : 90,
					template : template_date
				}];

				jQuery("#list").jqGrid({
					datatype : "local",
					height : 250,
					width : 'auto',
					colNames : col_names,
					colModel : col_model,
					pager : '#pager',
					gridview : true,
					rownumbers : true,
					rowNum : 10,
					rowList : [ 5, 10, 15 ],
					caption : 'Test Dashboard',
					gridComplete : function() {
						//한 row가 뿌려질때마다 수행 됨.
					}
				});

// 				var list = [ {
// 					num : "1",
// 					title : "title1",
// 					content : "content1",
// 					name : "name1",
// 					regDate : "2020-12-25"
// 				}];
				var list;
				
				$.ajax({
					url : "board_jqgrid_json.do",
					data : {},
					dataType : "json",
					success : function(responseData, status, xhr) {
	 					console.log(responseData.list);
						list = responseData.list;
						
						for (var i = 0; i <= list.length; i++) {
							jQuery("#list").jqGrid('addRowData', i + 1, list[i]);
						}

						jQuery("#list").jqGrid.rowNum = 10;

						gridComplete();
					}//end success
				});
			});

	var setLinkFn = function(cellvalue,options,rowObject){
		console.log(cellvalue);
		console.log(rowObject.num);
		return "<a href='search.do?num="+rowObject.num+"'>"+cellvalue+"</a>";
// 		return cellvalue;
	};
	
	var gridComplete = function() {
		var maxDate;
		var rowIDs = jQuery("#list").jqGrid('getDataIDs');

		for (var i = 0; i < rowIDs.length; i++) {
			var rowID = rowIDs[i];
			var row = jQuery('#list').jqGrid('getRowData', rowID);

			if (i == 0) {
				maxDate = row.invdate;
			} else {
				if (maxDate < row.invdate) {
					maxDate = row.invdate;
				}
			}
		}

		$("#maxDateField").val(maxDate);
	}
</script>
</head>

<body>
	<table id="list"></table>
	<div id="pager"></div>
	<br> Max Date :
	<input id="maxDateField" value="" width="150px">
</body>
</html>
