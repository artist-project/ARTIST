using System;
using System.Collections.Generic;
using System.Data.Objects;
using System.Linq;
using System.Linq.Expressions;

namespace DBML_Model.DAL
{
	public class GenericRepository<TEntity> : IRepository<TEntity> where TEntity : class
	{
    
    	private ObjectContext _context;
   		private IObjectSet<TEntity> _objectSet;
 
    	public GenericRepository(ObjectContext context)
    	{
        	_context = context;
        	_objectSet = _context.CreateObjectSet<TEntity>();
    	}
 
    	public IQueryable<TEntity> GetQuery()
    	{
        	return _objectSet;
    	}
 
   		public IEnumerable<TEntity> GetAll()
    	{
        	return GetQuery().AsEnumerable();
    	}
    	
		public IEnumerable<TEntity> Find(Expression<Func<TEntity, bool>> predicate)
    	{
        	return _objectSet.Where<TEntity>(predicate);
    	}
 
   		public TEntity Single(Expression<Func<TEntity, bool>> predicate)
    	{
        	return _objectSet.Single<TEntity>(predicate);
    	}
 
    	public TEntity First(Expression<Func<TEntity, bool>> predicate)
    	{
        	return _objectSet.First<TEntity>(predicate);
    	}
 
   		public void Delete(TEntity entity)
    	{
        	if (entity == null)
        	{
            	throw new ArgumentNullException("entity");
        	}
 
        	_objectSet.DeleteObject(entity);
    	}
 
   		public void Add(TEntity entity)
    	{
        	if (entity == null)
        	{
            	throw new ArgumentNullException("entity");
        	}
 
        	_objectSet.AddObject(entity);
    	}
 
   		public void Attach(TEntity entity)
    	{
        	_objectSet.Attach(entity);
    	}
 
   		public void SaveChanges()
    	{
        	_context.SaveChanges();
    	}
 
   		public void SaveChanges(SaveOptions options)
    	{
        	_context.SaveChanges(options);
    	}
 
   		public void Dispose()
    	{
        	Dispose(true);
        	GC.SuppressFinalize(this);
    	}
 
    	protected virtual void Dispose(bool disposing)
    	{
        	if (disposing)
        	{
            	if (_context != null)
            	{
                	_context.Dispose();
                	_context = null;
            	}
        	}
    	}
	}
}
