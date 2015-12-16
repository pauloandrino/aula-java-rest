<html>
<link rel="stylesheet" href="css/bootstrap.css">
<body>
	<h2>Adicionar Categoria</h2>
	
	<div class="jumbotron">
	  <div class="container">
			<form  method="POST" action="/rest/rest/categoria/create" class="form-horizontal">
				<div class="form-group">
					<label for=nome>Nome:</label> 
					<input type="text" class="form-control" name="nome" id="nome" required="required" autofocus placeholder="Digite o nome da categoria"/><br />
				</div>
				<button type="submit" class="btn btn-primary">Gravar</button>
				<input type="reset" class="btn btn-primary" name="reset" value="Limpar">
				<br/><br/><br/>
			</form>
		</div>
	</div>
<!-- 	<input type="submit" class="btn btn-primary" name="rest" value="rest"> -->
	
	
</body>
</html>
