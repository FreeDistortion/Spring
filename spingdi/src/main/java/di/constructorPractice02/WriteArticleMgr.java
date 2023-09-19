package di.constructorPractice02;

public class WriteArticleMgr implements IWriteArticleMgr {
	private IArticleDAO articleDAO;
	
	

	public WriteArticleMgr(IArticleDAO articleDAO) {
		super();
		this.articleDAO = articleDAO;
	}



	@Override
	public void write(ArticleDTO article) {
		// TODO Auto-generated method stub
		articleDAO.insert(article);
	}




}
