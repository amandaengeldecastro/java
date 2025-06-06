package com.servlet;

import com.example.Conta;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.*;

public class ContaServlet extends HttpServlet {
    private static final List<Conta> contas = new ArrayList<>();
    private static final List<String> MESES = Arrays.asList(
        "JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO",
        "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"
    );

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        Map<String, Double> valores = new LinkedHashMap<>();

        for (String mes : MESES) {
            String valorParam = req.getParameter(mes.toLowerCase());
            double valor = 0.0;
            try {
                if (valorParam != null && !valorParam.isEmpty()) {
                    valor = Double.parseDouble(valorParam);
                }
            } catch (NumberFormatException e) {
            }
            valores.put(mes, valor);
        }

        contas.add(new Conta(nome, valores));
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String excluirNome = req.getParameter("excluir");
        if (excluirNome != null && !excluirNome.isEmpty()) {
            contas.removeIf(conta -> conta.getNome().equals(excluirNome));
        }

        req.setAttribute("contas", contas);
        req.setAttribute("meses", MESES);
        req.getRequestDispatcher("relatorio.jsp").forward(req, resp);
    }
}
