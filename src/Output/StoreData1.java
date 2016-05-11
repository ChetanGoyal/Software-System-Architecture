/**
 * It stores the data entered by the user in to temporary  variable.
 */
package Output;

import Data.Account1;

/**
 * @author Chetan Goyal
 *
 */
public class StoreData1 extends StoreData {
	private Account1 data;

    public StoreData1(Account1 data) {
        this.data = data;
    }

    @Override
    public void storeData() {
        
        data.setPin(data.getPinInput());
        data.setUid(data.getUidInput());
        data.setBal(data.getBalInput());
    }
}
