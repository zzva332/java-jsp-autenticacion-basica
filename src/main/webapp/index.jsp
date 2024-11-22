
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en"><head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        .local-primary {
            color: #fff;
            background-color: #000;
        }
        .local-secondary {
            color: #000;
            background-color: #fff;
        }

        header {
            background-color: #ccc;
            padding: 10px;
            width: 100%;
        }


        /* ================== LOGIN, FORGET PASSWORD =================*/
        .container-full {
          display: flex;
          justify-content: center;
          flex-direction: column;
          align-items: center;
          height: 100vh; /* 100vh = 100% de la altura de la viewport */
        }
        .container-full form {
            padding: 6px;
        }

        .page-full header{
            position: fixed;
        }

    </style>
</head>
<body class="page-full">
    <main class="container container-full">
        <div class="p-3">
            <img src="images/logo-black.png" width="45px"/>
        </div>
        <%
            if(request.getAttribute("errorMessage") != null){
        %>
        <div class="alert alert-danger">
            <p><%= request.getAttribute("errorMessage").toString() %></p>
        </div>
        <%
            }
        %>
        <form class="card col-lg-3 col-md-6 col-12" action="<%=request.getContextPath()%>/login" method="post">
            <div class="card-body">
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" id="email" name="email" placeholder="example@example.com" class="form-control">
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" id="password" name="password" placeholder="******" class="form-control">
                </div>
                <div class="mb-3 d-flex">
                    <button type="submit" class="btn btn-dark w-100" href="home.html">Sign In</button>
                </div>
            </div>
        </form>
    </main>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</body>
</html>