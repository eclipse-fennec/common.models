/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Buffer Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the use of buffers by a Queuing Service. The existence and management of individual buffers will be modeled in a future release. At the current level of abstraction, modeling the existence of the BufferPool is necessary. Long term, it is not sufficient. 
 * 
 * In implementations where there are multiple buffer sizes, an instance of BufferPool should be defined for each set of buffers with identical or similar sizes. These instances of buffer pools can then be grouped together using the CollectedBuffersPool association. 
 * 
 * Note that this class is derived from CollectionOfMSEs, and not from Forwarding or ConditioningService. BufferPool is only a collection of storage, and is NOT a Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getBufferSize <em>Buffer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getSizeOfBuffers <em>Size Of Buffers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getTotalBuffers <em>Total Buffers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getAvailableBuffers <em>Available Buffers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BufferPool#getSharedBuffers <em>Shared Buffers</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Network::Buffers' override.CollectionID='string' override.CollectionID.Key='true' override.CollectionID.Description='This property is defined in the CollectionOfMSEs class, but is overridden here to serve as part of the (composite) key that identifies the BufferPool instance.' override.CollectionID.MaxLen='256' keys='CollectionID,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_BufferPool extends CIM_CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the label by which the object is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 16-bit unsigned integer, and defines the number of bytes in each buffer. It is deprecated in lieu of a similar uint32 property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Size</em>' attribute.
	 * @see #setBufferSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_BufferSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_BufferPool.SizeOfBuffers\"]' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Integer getBufferSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getBufferSize <em>Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Size</em>' attribute.
	 * @see #getBufferSize()
	 * @generated
	 */
	void setBufferSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Size Of Buffers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer, and defines the number of bytes in each buffer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Of Buffers</em>' attribute.
	 * @see #setSizeOfBuffers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_SizeOfBuffers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getSizeOfBuffers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getSizeOfBuffers <em>Size Of Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Of Buffers</em>' attribute.
	 * @see #getSizeOfBuffers()
	 * @generated
	 */
	void setSizeOfBuffers(Long value);

	/**
	 * Returns the value of the '<em><b>Total Buffers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer, and defines the total number of buffers in the Pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Buffers</em>' attribute.
	 * @see #setTotalBuffers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_TotalBuffers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getTotalBuffers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getTotalBuffers <em>Total Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Buffers</em>' attribute.
	 * @see #getTotalBuffers()
	 * @generated
	 */
	void setTotalBuffers(Long value);

	/**
	 * Returns the value of the '<em><b>Available Buffers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer, and defines the number of buffers in the Pool that are currently not allocated to any instance of a QueuingService. Buffers allocated to a QueuingService could either be in use (containing packet data), or allocated to a Queue pending the arrival of new packet data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Buffers</em>' attribute.
	 * @see #setAvailableBuffers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_AvailableBuffers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getAvailableBuffers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getAvailableBuffers <em>Available Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Buffers</em>' attribute.
	 * @see #getAvailableBuffers()
	 * @generated
	 */
	void setAvailableBuffers(Long value);

	/**
	 * Returns the value of the '<em><b>Shared Buffers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer, and defines the number of buffers in the Pool that have been simultaneously allocated to multiple instances of QueuingService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shared Buffers</em>' attribute.
	 * @see #setSharedBuffers(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BufferPool_SharedBuffers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getSharedBuffers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BufferPool#getSharedBuffers <em>Shared Buffers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Buffers</em>' attribute.
	 * @see #getSharedBuffers()
	 * @generated
	 */
	void setSharedBuffers(Long value);

} // CIM_BufferPool
