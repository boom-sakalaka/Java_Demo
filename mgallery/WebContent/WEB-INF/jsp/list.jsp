<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>油画列表</title>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/sweetalert2.js"></script>
<link rel="stylesheet" type="text/css" href="css\list.css">
<script>
	function showPreview(previewObj) {
		var preview =  $(previewObj).attr("data-preview");
		var pname = $(previewObj).attr("data-pname");
		Swal.fire({
			title: pname,
			html: '<img src="'+ preview +'" style="width:361px;height:240px;" />',
			showCloseButton: true,
			showConfirmButton: false
		});
	}
	
</script>
</head>
<body>
	<div class="container">
		<fieldset>
			<legend>油画列表</legend>
			<div style="height: 40px">
				<a href="/management?method=show_create" class="btn-button">新增</a>
			</div>
			<!-- 油画列表 -->
			<table cellspacing="0px">
				<thead>
					<tr style="width: 150px;">
						<th style="width: 100px">分类</th>
						<th style="width: 150px;">名称</th>
						<th style="width: 100px;">价格</th>
						<th style="width: 400px">描述</th>
						<th style="width: 100px">操作</th>
					</tr>
				</thead>
				<c:forEach items="${pageModel.pageData }" var="painting">
					<tr>
						<td>
							<c:choose>
								 <c:when test="${painting.category == 1 }">
     									现实主义
    							</c:when>
    							 <c:when test="${painting.category == 2 }">
     									抽象主义
    							</c:when>
    							<c:otherwise>
							        	未知类型
							    </c:otherwise>
							</c:choose>
						</td>
						<td>${painting.pname }</td>
						<td>
							<fmt:formatNumber pattern="￥0.00">${painting.price }	</fmt:formatNumber>
						</td>
						<td>${painting.description }</td>
						<td>
							<a class="oplink" data-preview="${painting.preview }" data-pname="${painting.pname }" onclick="showPreview(this)" href="javascript:void(0)">预览</a>
							<a class="oplink" href="#">修改</a>
							<a class="oplink" href="#">删除</a>
						</td>
					</tr>
				</c:forEach>
					
			</table>
			<!-- 分页组件 -->
			<ul class="page">
				<li><a href="/management?method=list&p=1">首页</a></l"WebContent/WEB-INF/jsp"i>
				<li><a href="/management?method=list&p=${pageModel.hasPreviousPage ? pageModel.page-1:1  }">上页</a></li>
				<c:forEach begin="1" end="${pageModel.totalPages }" var="pno" step="1">
				<li>
				<a href="/management?method=list&p=${ pno}">
					<span ${pno==pageModel.page? "class='first-page'" : ""} >${pno }</span>
				</a>
				</li>
			</c:forEach>
				<li><a href="/management?method=list&p=${pageModel.hasNextPage ? pageModel.page+1 : pageModel.totalPages }">下页</a></li>
				<li><a href="/management?method=list&p=${pageModel.totalPages }">尾页</a></li>
			</ul>
		</fieldset>
	</div>

	
</body>
</html>
