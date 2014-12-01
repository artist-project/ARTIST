using System;
using System.Collections.Generic;
using System.Data.Objects;
using System.Linq;
using System.Linq.Expressions;

namespace SP_Model.DAL
{
	public interface IRepository<TEntity> : IDisposable where TEntity : class
	{
    	IQueryable<TEntity> GetQuery();
    	IEnumerable<TEntity> GetAll();
    	IEnumerable<TEntity> Find(Expression<Func<TEntity, bool>> predicate);
    	TEntity Single(Expression<Func<TEntity, bool>> predicate);
    	TEntity First(Expression<Func<TEntity, bool>> predicate);
    	void Add(TEntity entity);
    	void Delete(TEntity entity);
    	void Attach(TEntity entity);
    	void SaveChanges();
    	void SaveChanges(SaveOptions options);
	}
}
