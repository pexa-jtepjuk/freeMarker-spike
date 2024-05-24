<!DOCTYPE html>
<html lang="en">
<head>
    <title>Spring Boot FreeMarker example</title>
</head>
<body>
<div>
    <p>I AM TESTING</p>
    <p>${customers.title}</p>
    <p>${customers.details}</p>
    <#list customers.addresses as address>
        <p>Street: ${address.street}: City ${address.city}</p>
    </#list>

<#--    <table class="table">-->
<#--        <thead>-->
<#--        <tr>-->
<#--            <th>#</th>-->
<#--            <th>TEST</th>-->
<#--            <th>Email</th>-->
<#--            <th>Birthdate</th>-->
<#--        </tr>-->
<#--        </thead>-->
<#--        <tbody>-->
<#--         <#list customer.address as address>-->
<#--         <p>${address.street}, ${address.city}</p>-->
<#--         </#list>-->
<#--         <#list model["customers"] as key, value>-->
<#--             <p>${key}: ${value}</p>-->
<#--             <p>${customer.name}</p>-->
<#--             <#list customer.address as address>-->
<#--                 <p>${address.street}, ${address.city}</p>-->
<#--             </#list>-->
<#--             <br/>-->
<#--         </#list>-->
<#--        </tbody>-->
<#--    </table>-->
</div>
</body>
</html>