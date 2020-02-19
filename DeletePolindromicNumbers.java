package org.java.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class DeletePolindromicNumbers {

	@SuppressWarnings("unused")
	ArrayList<Integer> generate() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (true) {
			String s = reader.readLine();
			if (s.isEmpty())
				break;
			list.add(Integer.parseInt(s));
		}
		for (Integer x : list) {
			
		}
		
		reader.close();
		return list;
	}

	@SuppressWarnings("unused")
	ArrayList<Integer> findPalindromicNumbers(ArrayList<Integer> list) throws NumberFormatException {
		ArrayList<Integer> result = new ArrayList<>();
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer sourceNumber = it.next();
			StringBuilder s = new StringBuilder(sourceNumber.toString());
			if (s.toString().equals(s.reverse().toString())) {
				result.add(sourceNumber);
				it.remove();
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		System.out.println("Введите случайные числа в формате: <цифра> потом клавиша <ввод> ");
		DeletePolindromicNumbers runners = new DeletePolindromicNumbers();
		ArrayList<Integer> list = runners.generate();
		ArrayList<Integer> convertresult = runners.findPalindromicNumbers(list);
		System.out.println("Числа являющиеся палиндромами : ");
		for (Integer num : convertresult) {
			System.out.println(num);
		}
		System.out.println("Числа оставшиеся в коллекции после удаления палиндромов : ");
		for (Integer num : list) {
			System.out.println(num);
		}
	}
}
