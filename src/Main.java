
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ParseInput parser = new ParseInput("test.in");
		
		
		Terrain map(parser);
		// Analyse terrain
		//TerrainAnalyser Analyzer = new Analyzer()
		
		parser.write();

	}

}
