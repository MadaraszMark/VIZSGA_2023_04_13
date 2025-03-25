package task_05.presenter;

import java.util.List;

import task_05.dao.FootWearCategoryDao;
import task_05.dao.FootWearDao;
import task_05.model.FootWear;
import task_05.model.FootWearCategory;
import task_05.view.IViewListener;
import task_05.view.View;

public class FootWearPresenter implements IViewListener{

	private final View view;
	private final FootWearDao footWearDao;
	private final FootWearCategoryDao footWearCategoryDao;
	
	public FootWearPresenter(final View view,
		final FootWearDao footWearDao,
		final FootWearCategoryDao footWearCategoryDao) {
		this.view = view;
		view.addListener(this);
		this.footWearDao = footWearDao;
		this.footWearCategoryDao = footWearCategoryDao;
		this.fillTableFootWear(footWearDao.getAll());
	}
	
	@Override
	public void onButtonClickedCreateFrame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onButtonClickedSaveFootWear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onButtonClickedCloseFootWearNewFrame() {
		// TODO Auto-generated method stub
		
	}
	
	public void fillTableFootWear(List<FootWear> footWears) {
		view.setModelToTableFootWear(footWears);
	}

	@Override
	public void onButtonClickedExit() {
		System.exit(0);
	}
}
