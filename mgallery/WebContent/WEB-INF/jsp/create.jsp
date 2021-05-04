<%@page contentType="text/html;charset=utf-8"%>
<!-- 新增油画页面 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>新增油画</title>
<link rel="stylesheet" type="text/css" href="css\create.css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
	<div class="container">
		<fieldset>
			<legend>新增油画</legend>
			<form action="/management?method=create" method="post"
				autocomplete="off" enctype="multipart/form-data">
				<ul class="ulform">
					<li>
						<span>油画名称</span>
						<span id="errPname"></span>
						<input id="pname" name="pname" />
					</li>
					<li>
						<span>油画类型</span>
						<span id="errCategory"></span>
						<select id="category" name="category">
							<option value="-1">请选择油画类型</option>
							<option value="1">现实主义</option>
							<option value="2">抽象主义</option>
						</select>
					</li>
					<li>
						<span>油画价格</span>
						<span id="errPrice"></span>
						<input id="price" name="price"/>
					</li>
					<li>
						<span>作品预览</span>
						<span id="errPainting"></span>
						<input id="painting" name="painting" type="file" 
							style="padding-left: 0px;" accept="image/*" />
					</li>

					<li>
						<span>详细描述</span>
						<span id="errDescription"></span>
						<textarea
							id="description" name="description"></textarea>
					</li>
					<li style="text-align: center;">
						<button type="submit" class="btn-button">提交表单</button>
					</li>
				</ul>
			</form>
		</fieldset>
	</div>

</body>
</html>
