package task_03;

public class App {

	public static void main(String[] args) {
		NotebookPart notebookPart = new NotebookPart(
				1,
				"tesztN�v",
				"STKF-23141",
				"Toshiba", 
				"FESF-234",
				0,
				35800);
		notebookPart.setShippingDay(4);
		System.out.println(notebookPart);
		
		TaskSolution taskSolutionObj = new TaskSolution();
		taskSolutionObj.fillPartsFromConsole();
		taskSolutionObj.printAllParts();
		taskSolutionObj.getLeastExpensivePart();
		
		// Kész
		
	}

}
