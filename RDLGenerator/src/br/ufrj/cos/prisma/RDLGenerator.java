package br.ufrj.cos.prisma;

import br.ufrj.cos.prisma.Parser.CNETParserManager;
import br.ufrj.cos.prisma.Parser.XPDLManagerv2;

public class RDLGenerator {

	public static void main(String[] args) {
		generateFromXPDL();
	}

	protected static void generateFromCNet() {
		CNETParserManager.getInstance().visitGraph();
	}
	
	protected static void generateFromXPDL() {
		XPDLManagerv2.getInstance().visitGraph();
	}
}
