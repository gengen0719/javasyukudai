/**
 * 初乗り料金が1700mまで610円、
 * それ以降は313mごとに80円のタクシーがある。
 * このタクシーに乗った距離をm単位で入力し、料金を計算するプログラムを作成せよ。
 */
public class TaxiFareCalculator {
	public static void main(String[] args) {
		System.out.println("タクシー料金は" + calc(2013) + "円です。");
	}

	private static final int INITIAL_FARE = 610;//初乗り料金
	private static final int INITIAL_FARE_DISTANCE = 1700;//初乗り料金で乗れる距離
	private static final int ADDITIONAL_FARE = 80;//追加料金
	private static final int ADDITIONAL_FARE_DISTANCE = 313;//追加料金で乗れる距離

	private static int calc(int distance) {
		if (distance <= INITIAL_FARE_DISTANCE) {
			return INITIAL_FARE;
		}
		int initialFareOverDistance = distance - INITIAL_FARE_DISTANCE;
		int additionalFareCount = initialFareOverDistance / ADDITIONAL_FARE_DISTANCE;
		if (initialFareOverDistance % ADDITIONAL_FARE_DISTANCE != 0) {
			additionalFareCount++;
		}
		return INITIAL_FARE + additionalFareCount * ADDITIONAL_FARE;
	}
}
