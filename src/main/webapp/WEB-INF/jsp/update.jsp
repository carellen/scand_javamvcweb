<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.1 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
    <title>Update</title>
    <s:head />
</head>
<body>
<table id="t01" class="table table-hover">
    <thead>
    <tr>
        <th>Id</th>
        <th>FirstName</th>
        <th>LastName</th>
    </tr>
    </thead>
    <tbody>
    <s:iterator var="list" value="entityList" >
        <tr class="rows" onclick="myFunction(this)">
            <td class="id"><s:property value="id"/></td>
            <td class="firstName"><s:property value="firstName"/></td>
            <td class="lastName"><s:property value="lastName"/></td>
            <td class="position"><s:property value="position"/></td>
            <td class="department"><s:property value="department"/></td>
            <td class="characteristic"><s:property value="characteristic"/></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<div id="selectedId"></div>

</body>
</html>
