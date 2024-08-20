package chapter12.code2

/*
 * 스텁 객체는 미리 정의된 데이터를 반환하는 모방 객체로 반환값이 없는 동작은 구현하지 않으며, 반환값이 있는 동작만 미리 정의된 데이터를 반환하도록 구현
 */
class StubUserNameRepository (
    private val userNameMap: Map<String, String>
) : UserNameRepository {

    override fun saveUserName(id: String, name: String) {
        // no implementation
    }

    override fun getNameByUserId(id: String): String {
        return userNameMap[id] ?: ""
    }

}