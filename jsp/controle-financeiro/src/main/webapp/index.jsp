<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Contas</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f2f5;
            margin: 0;
            padding: 40px 20px;
            display: flex;
            justify-content: center;
            align-items: flex-start;
            min-height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 30px 35px;
            border-radius: 10px;
            box-shadow: 0 6px 18px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 900px;
        }

        h1 {
            text-align: center;
            color: #2c3e50;
            font-size: 28px;
            margin-bottom: 30px;
        }

        form {
            width: 100%;
        }

        label {
            font-weight: 600;
            color: #333;
            display: block;
            margin-bottom: 6px;
        }

        input[type="text"] {
            width: 100%;
            padding: 12px 14px;
            margin-bottom: 25px;
            border: 1.5px solid #ccc;
            border-radius: 6px;
            font-size: 16px;
            transition: border-color 0.3s;
        }

        input[type="text"]:focus {
            border-color: #3f51b5;
            outline: none;
        }

        /* Tabela */
        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 25px;
            overflow-x: auto;
            display: block;
            white-space: nowrap; /* Previne que o conteúdo da tabela quebre */
        }

        th, td {
            padding: 14px 10px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #3f51b5;
            color: #fff;
            font-size: 14px;
            font-weight: 600;
        }

        input[type="number"] {
            width: 90px;
            padding: 8px 10px;
            font-size: 14px;
            text-align: right;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: border-color 0.3s;
        }

        input[type="number"]:focus {
            border-color: #3f51b5;
            outline: none;
        }

        input[type="submit"] {
            display: block;
            margin: 30px auto 10px;
            background-color: #3f51b5;
            color: #fff;
            border: none;
            padding: 14px 32px;
            font-size: 16px;
            font-weight: bold;
            border-radius: 6px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #303f9f;
        }

        a {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #3f51b5;
            font-weight: 600;
            text-decoration: none;
            transition: color 0.3s;
        }

        a:hover {
            color: #303f9f;
        }

        /* Responsividade */
        @media (max-width: 768px) {
            table {
                display: block;
                width: 100%;
                overflow-x: auto;
            }

            table thead {
                display: block;
                width: 100%;
            }

            td, th {
                text-align: left;
                display: inline-block;
                width: 100%;
                padding: 12px;
                box-sizing: border-box;
            }

            td {
                border-bottom: 1px solid #ddd;
                padding-left: 50%;
                position: relative;
            }

            td::before {
                content: attr(data-label);
                position: absolute;
                left: 10px;
                top: 12px;
                font-weight: bold;
                color: #333;
            }

            input[type="number"] {
                width: 100%;
                padding: 10px;
            }

            input[type="text"] {
                width: 100%;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Cadastro de Conta</h1>
        <form action="conta" method="post">
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome" placeholder="Ex: Conta de Energia" required>

            <table>
                <thead>
                    <tr>
                        <% 
                            String[] meses = {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", 
                                             "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"}; 
                            for (String mes : meses) { 
                        %>
                        <th><%= mes %></th>
                        <% } %>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <% for (String mes : meses) { %>
                        <td data-label="<%= mes %>">
                            <input type="number" step="0.01" name="<%= mes.toLowerCase() %>" placeholder="0.00" min="0">
                        </td>
                        <% } %>
                    </tr>
                </tbody>
            </table>

            <input type="submit" value="Salvar">
        </form>
        <a href="conta">Ver Relatório</a>
    </div>
</body>
</html>
