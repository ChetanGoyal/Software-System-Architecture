/**
 * It stores the details of the user in to temporary variable.
 */
package Output;

import Data.Account2;

/**
 * @author Chetan Goyal
 *
 */
public class StoreData2 extends StoreData {
	private Account2 data;

    public StoreData2(Account2 data) {
        this.data = data;
    }

    @Override
    public void storeData() {
        
        data.setPin(data.getPinInput());
        data.setUid(data.getUidInput());
        data.setBalance(data.getBalInput());
    }
}
