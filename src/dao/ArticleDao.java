package dao;

public class ArticleDao extends Article implements IDao<Article> {
    public ArticleDao(int id, String title, int userId) {
        super(id, title, userId);
    }

    @Override
    public void add() {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, IDao dao) {

    }

    @Override
    public Article[] getAll() {
        return new Article[0];
    }

    @Override
    public Article getById(int id) {
        return null;
    }
}
