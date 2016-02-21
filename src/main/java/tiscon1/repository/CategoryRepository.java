package tiscon1.repository;

import tiscon1.model.Item;

import java.io.IOException;
import java.util.List;

/**
 * @author fujiwara
 */
public interface CategoryRepository {
    List<Item> findTop10(String genreId, String subgenreId) throws IOException;

    /**
     * よっしー加筆
     * トップページの負荷対策
     * 取得するアイテム数を3個にしたメソッド
     * @param genreId
     * @param subgenreId
     * @return
     * @throws IOException
     */
    List<Item> findTop3(String genreId, String subgenreId) throws IOException;

    /**
     * よっしー加筆
     * テスト用の空のリストを返すメソッド
     * @return
     */
    List<Item> findEmptyList();

    Item searchItem(String genreId, String id) throws IOException;
}
