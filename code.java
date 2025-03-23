public List<List<Integer>> generate(int numRows) {
    //definition of two dimensional list
		List<List<Integer>> rowContent = new ArrayList<>();

		// declaring first dimension of two dimensional list
		for(int i = 0; i< numRows; i++) {
			rowContent.add(new ArrayList<>());
    }
		for(int i = 0; i < numRows; i++) {
			for(int j = 0;j <= i;j++) {
        //first element always be 1
				if(j == 0)
					rowContent.get(i).add(j, 1);
        //sum of previous right and left index's will equal to current index
				else if(i > 1 && j < i) {
					rowContent.get(i).add(j, (rowContent.get(i-1).get(j) + rowContent.get(i-1).get(j-1)));
				}
        //last element always be 1
				else
					rowContent.get(i).add(j, 1);
			}
		}
		
		return rowContent;
}
