-- Write your query below
select student_id, MIN(exam_id) exam_id, score
from exam_results e
where score = (
    select Max(score)
    from exam_results
    where student_id = e.student_id
)
group by student_id, score
order by student_id asc;