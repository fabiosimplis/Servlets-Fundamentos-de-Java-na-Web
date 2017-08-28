<html>
<body>
Bem vindo ao nosso gerenciador de empresas!<br/>

<c:if test="${logado!=null}"><!-- mostra usuario logado, Logado tem de estar com o mesmo string que no co
codigo da classe login -->
    Você está logado como ${logado.email}<br/>
</c:if>

 <br>Adiciona</br>
 <form action="controle?tarefa=NovaEmpresa" method="post">
     Nome: <input type="text" name="nome" /><br />
     <input type="submit" value="Enviar" />
 </form>
 <br>LOGIN</br>
 <form action="login" method="post">
    Email: <input type="text" name="email" /><br />
    Senha: <input type="password" name="senha" /><br />
    <input type="submit" value="Login" />
</form>

<form action="controle?tarefa=Logout" method="post">
    <input type="submit" value="Logout" />
</form>
 
</body>
</html>