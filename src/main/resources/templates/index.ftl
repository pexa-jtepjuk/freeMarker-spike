<!DOCTYPE html>
<html lang="en">
<head>
    <title>Spring Boot FreeMarker example</title>
</head>
<body>
<div>
    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th>TEST</th>
            <th>Email</th>
            <th>Birthdate</th>
        </tr>
        </thead>
        <tbody>
         <p>I AM TESTING</p>
         <#list model["customers"] as customer>
             <p>${customer.id}</p>
             <p>${customer.name}</p>
             <#list customer.address as address>
                 <p>${address.street}, ${address.city}</p>
             </#list>
             <br/>
         </#list>
        </tbody>
    </table>
</div>
</body>
</html>