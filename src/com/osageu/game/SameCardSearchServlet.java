package com.osageu.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sameCardSearch")
public class SameCardSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SameCardSearchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Integer> card = new ArrayList<>(); 
		for (int i = 0; i < 16; i++) { 
			card.add(i); 
		} 
		Collections.shuffle(card); 

		request.setAttribute("card", card);
		request.getRequestDispatcher("views/game/same_card_search.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
