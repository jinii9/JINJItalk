package server.userdb;


public class User {

  private String uname;
  private String uid;//사실 이메일
  private String unickname;
  private String uemail;//사실 아이디
  private String birth;
  private String today;
  private String password;

  public User(String uname, String uid, String unickname, String uemail, String birth, String today, String password) {

    this.uname = uname;
    this.uemail = uemail;
    this.password = password;
    this.birth=birth;
    this.today=today;
    this.uid=uid;
    this.unickname=unickname;
    
  }
                

  public String getUname() {

    return uname;
  }

  public void setUname(String uname) {

    this.uname = uname;
  }

  public String getUemail() {

    return uemail;
  }

  public void setUemail(String uemail) {

    this.uemail = uemail;
  }

  public String getPassword() {

    return password;
  }

  public void setPassword(String password) {

    this.password = password;
  }
  
  //이외의 것 추가시키기
  
  public String getUid() {
	return uid;
  }


  public void setUid(String uid) {
	this.uid = uid;
  }


  public String getUnickname() {
	return unickname;
  }


  public void setUnickname(String unickname) {
	this.unickname = unickname;
  }


  public String getBirth() {
	return birth;
  }


  public void setBirth(String birth) {
	this.birth = birth;
  }


  public String getToday() {
	return today;
  }


  public void setToday(String today) {
	this.today = today;
  }


  
}