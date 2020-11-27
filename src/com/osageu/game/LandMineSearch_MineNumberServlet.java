package com.osageu.game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/mine.no")
public class LandMineSearch_MineNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LandMineSearch_MineNumberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eqNo = Integer.parseInt(request.getParameter("eqNo"));
		Random ran = new Random();
		int[] mine = new int[10];
		for(int i = 0 ; i < mine.length ; i++) { // i = 14
			int nansu = ran.nextInt(95); // i가 올라갈 때마다 새로운 난수
			if(i == 0) {
				if(nansu == eqNo || nansu == eqNo-1 || nansu == eqNo-7 || nansu == eqNo-8 || nansu == eqNo-9
					|| nansu == eqNo+1 || nansu == eqNo+7 || nansu == eqNo+8 || nansu == eqNo+9) {
					i = -1;
				}else {
					mine[i] = nansu;
				}
			}else {
				for(int j = 0 ; j < i ; j++) {
					if(nansu == mine[j] || nansu == eqNo || nansu == eqNo-1 || nansu == eqNo-7 || nansu == eqNo-8 || nansu == eqNo-9
							|| nansu == eqNo+1 || nansu == eqNo+7 || nansu == eqNo+8 || nansu == eqNo+9) {
						i--;
						break;
					}else {
						mine[i] = nansu;
					}
				}
			}
			
		}
		ArrayList<int[]> list = new ArrayList<>();
		list.add(mine);
		Gson gson = new Gson();
		response.setContentType("application/json; charset=UTF-8");
		gson.toJson(list, response.getWriter());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
