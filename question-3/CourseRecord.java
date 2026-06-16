public int moreHistoryThanMathAbsences()
{
    int count = 0;

    for (int i = 0; i < historyList.size(); i++)
    {
        CourseRecord history = historyList.get(i);

        for (int j = 0; j < mathList.size(); j++)
        {
            CourseRecord math = mathList.get(j);

            if (history.getStudentID().equals(math.getStudentID()))
            {
                if (history.getAbsences() > math.getAbsences())
                {
                    count++;
                }
            }
        }
    }

    return count;
}
