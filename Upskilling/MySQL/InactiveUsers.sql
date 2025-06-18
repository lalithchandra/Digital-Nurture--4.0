SELECT u.user_id, u.full_name
FROM Users u
LEFT JOIN Registrations r ON u.user_id = r.user_id
GROUP BY u.user_id
HAVING MAX(r.registration_date) IS NULL 
   OR MAX(r.registration_date) < CURRENT_DATE - INTERVAL 90 DAY;
