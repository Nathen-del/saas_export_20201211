<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<table align="center" border="1px" width="50%">
    <thead>
    <tr>
        <th class="sorting">企业名称</th>
        <th class="sorting">所在地</th>
        <th class="sorting">地址</th>
        <th class="sorting">企业法人</th>
        <th class="sorting">联系方式</th>
        <th class="sorting">所属行业</th>
        <th class="sorting">状态</th>
        <th class="sorting">余额</th>
    </tr>
    </thead>
    <tbody id="tbody"></tbody>

<tbody>
    <script type="text/javascript">
        $.ajax({
            url:"${pageContext.request.contextPath}/company/list",
            method:"post",
            success:function (companyResult) {

                let html ='';

                for (let key of companyResult){
             html+= `<tr>
                    <td>\${key.name}</td>
                    <td>\${key.city}</td>
                    <td>\${key.address}</td>
                    <td>\${key.representative}</td>
                    <td>\${key.phone}</td>
                    <td>\${key.industry}</td>
                    <td>\${key.state}</td>
                    <td>\${key.balance}</td>
                    </tr>`
                }
                //添加到tbody里
                $("#tbody").html(html)  ;
            }
        });
    </script>
</tbody>

</table>
</body>
</html>
