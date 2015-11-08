package data.mysql.repo;

import javax.transaction.Transactional;

@Transactional
public interface TransactionDAO /* extends CrudRepository<Transaction,Integer> */ {

	/*@Query("from Transaction as tr where tr.user_id = ?1 ")
	List<Transaction> findAllUserTransactions(int userId);*/

}
