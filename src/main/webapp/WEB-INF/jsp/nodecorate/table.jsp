<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.1 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <title>Table</title>

</head>
<body>
<div class="tableforinsert">
    <s:form theme="simple">
    <table id="t02" class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Position</th>
            <th>Department</th>
            <th>Characteristic</th>
        </tr>
        </thead>
        <tr>
            <td><s:textfield name="id" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="firstName" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="lastName" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="position" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="department" style="color: bisque; background: transparent;"/></td>
            <td><s:textarea name="characteristic" style="color: bisque; background: transparent; height: 30px;"/></td>
        </tr>
    </table>
    </s:form>
</div>
</body>
</html>
