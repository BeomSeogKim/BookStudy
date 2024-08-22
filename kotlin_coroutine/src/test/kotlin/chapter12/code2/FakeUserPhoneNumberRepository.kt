package chapter12.code2

/**
 * fake object : 실제 객체와 비슷하게 동작하도록 구현된 모방 객체
 */
class FakeUserPhoneNumberRepository : UserPhoneNumberRepository {

    private val userPhoneNumberMap = mutableMapOf<String, String>()

    override fun saveUserPhoneNumber(id: String, phoneNumber: String) {
        userPhoneNumberMap[id] = phoneNumber

    }

    override fun getPhoneNumberByUserId(id: String): String {
        return userPhoneNumberMap[id] ?: ""
    }

}
