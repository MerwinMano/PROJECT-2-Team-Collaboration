package mer.mano.dao;

import java.util.List;

import mer.mano.model.Notification;


public interface NotificationDao {
List<Notification> getAllNotification(String email);//login id
void updateViewedStatus(int notificationId);
Notification getNotification(int id);
}
