package by.htp.db.console.controller;

import java.util.Date;

import by.htp.db.console.view.ConsoleOutput;
import by.htp.db.console.view.impl.SimpleConsoleOutput;
import by.htp.db.domain.vo.Catalog;
import by.htp.db.service.CatalogService;
import by.htp.db.service.impl.DefaultCatalogImpl;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsoleOutput output = new SimpleConsoleOutput();
		CatalogService service = new DefaultCatalogImpl();
		
		Catalog catalog = service.getCatalog();
		output.printCatalog(catalog);
		
		Catalog catalogDate = service.getCatalog(new Date());
		output.printCatalog(catalogDate);
	}

}
