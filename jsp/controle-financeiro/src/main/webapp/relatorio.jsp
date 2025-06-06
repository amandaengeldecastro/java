<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %> <!-- Importando a classe List -->
<%@ page import="com.example.Conta" %> <!-- Ajuste o pacote da classe Conta -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8" />
    <title>Relatório Financeiro</title>
    <style>
        /* seu CSS mantido exatamente igual */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f7f8;
            margin: 0;
            padding: 40px 20px;
            display: flex;
            justify-content: center;
        }
        .container {
            background: #ffffff;
            padding: 30px 35px;
            border-radius: 10px;
            box-shadow: 0 6px 18px rgba(0, 0, 0, 0.1);
            max-width: 1000px;
            width: 100%;
        }
        h1 {
            text-align: center;
            color: #2c3e50;
            font-size: 28px;
            margin-bottom: 30px;
        }
        .table-wrapper {
            overflow-x: auto; /* Habilita rolagem horizontal */
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 25px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 14px 10px;
            text-align: center;
            font-size: 14px;
        }
        th {
            background-color: #3f51b5;
            color: white;
            font-weight: 600;
        }
        td {
            color: #333;
        }
        a.button {
            display: inline-block;
            text-align: center;
            background-color: #3f51b5;
            color: white;
            padding: 12px 24px;
            text-decoration: none;
            font-weight: bold;
            border-radius: 6px;
            transition: background-color 0.3s ease;
            margin: 0 auto;
        }
        a.button:hover {
            background-color: #303f9f;
        }
        .delete-button {
            background-color: #e74c3c;
            color: white;
            padding: 8px 16px;
            font-weight: bold;
            border-radius: 6px;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }
        .delete-button:hover {
            background-color: #c0392b;
        }
        @media (max-width: 768px) {
            table, thead, tbody, th, td, tr {
                display: block;
            }
            thead {
                display: none;
            }
            tr {
                margin-bottom: 20px;
                background-color: #fafafa;
                border-radius: 6px;
                padding: 12px;
            }
            td {
                text-align: left;
                padding-left: 50%;
                position: relative;
                border: none;
                border-bottom: 1px solid #ddd;
            }
            td::before {
                content: attr(data-label);
                position: absolute;
                left: 10px;
                top: 12px;
                font-weight: bold;
                color: #333;
                white-space: nowrap;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Relatório de Contas</h1>
        <div class="table-wrapper">
            <table>
                <thead>
                    <tr>
                        <th>Nome</th>
                        <%
                            List<String> meses = (List<String>) request.getAttribute("meses");
                            if (meses != null) {
                                for (String mes : meses) {
                        %>
                            <th><%= mes %></th>
                        <%
                                }
                            }
                        %>
                        <th>Ações</th> <!-- Coluna de Ações para exclusão -->
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Conta> contas = (List<Conta>) request.getAttribute("contas");
                        if (contas != null && meses != null) {
                            for (Conta conta : contas) {
                    %>
                    <tr>
                        <td data-label="Nome"><%= conta.getNome() %></td>
                        <%
                            for (String mes : meses) {
                                double valor = conta.getValorMes(mes);
                        %>
                            <td data-label="<%= mes %>">R$ <%= String.format("%.2f", valor) %></td>
                        <%
                            }
                        %>
                        <td>
                            <!-- Botão de exclusão -->
                            <a href="conta?excluir=<%= conta.getNome() %>" class="delete-button" onclick="return confirm('Tem certeza que deseja excluir esta conta?');">Excluir</a>
                        </td>
                    </tr>
                    <%
                            }
                        } else {
                    %>
                    <tr>
                        <td colspan="<%= (meses != null ? meses.size() + 1 : 1) %>">Nenhum dado disponível.</td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
        <div style="text-align: center;">
            <a href="index.jsp" class="button">Cadastrar Nova Conta</a>
        </div>
    </div>
</body>
</html>
