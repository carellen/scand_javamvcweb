<!DOCTYPE html PUBLIC
"-//W3C//DTD XHTML 1.1 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
    <title>Table</title>

</head>
<body>
<div class="tableforinsert">
    <s:form method="POST" action="update" theme="simple">
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
            <td id="currId"><s:textfield name="employee.id" style="color: bisque; background: transparent;" readonly="true"/></td>
            <td><s:textfield name="employee.firstName" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="employee.lastName" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="employee.position" style="color: bisque; background: transparent;"/></td>
            <td><s:textfield name="employee.department" style="color: bisque; background: transparent;"/></td>
            <td><s:textarea name="employee.characteristic" style="color: bisque; background: transparent; height: 30px;"/></td>
        </tr>
    </table>
        <div id="updbtn" class="updbtnhide">

            <s:submit value="SAVE" class="btn btn-outline-warning"/>
        </div>
    </s:form>
</div>
</body>
</html>
