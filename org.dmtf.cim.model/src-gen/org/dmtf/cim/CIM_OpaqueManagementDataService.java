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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Opaque Management Data Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Service that contains global properties of the opaque management data functionality in the CIM server, and provides methods for using this functionality.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataService#getAvailableStorage <em>Available Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataService#getLockTimeout <em>Lock Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OpaqueManagementDataService#getMaxCreateSize <em>Max Create Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.1' UMLPackagePath='CIM::Core::OpaqueManagementData' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OpaqueManagementDataService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Available Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes of opaque management data storage available from the CIM_OpaqueManagementDataService. The value of AvailableStorage shall not exceed the value of MaxAvailableStorage in the associated CIM_OpaqueManagementDataCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Storage</em>' attribute.
	 * @see #setAvailableStorage(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataService_AvailableStorage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_OpaqueManagementDataCapabilities.MaxAvailableStorage\"]' PUnit='byte'"
	 * @generated
	 */
	Long getAvailableStorage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataService#getAvailableStorage <em>Available Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available Storage</em>' attribute.
	 * @see #getAvailableStorage()
	 * @generated
	 */
	void setAvailableStorage(Long value);

	/**
	 * Returns the value of the '<em><b>Lock Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time a lock on a CIM_OpaqueManagementData instance shall remain in effect without execution of any CIM_OpaqueManagementDataService extrinsic methods on that CIM_OpaqueManagementData instance by the Identity that holds the lock. Locks on CIM_OpaqueManagementData are created by Lock(). The intent of the timeout is to ensure that a lock is released if the lock holder neglects to release it or is unable to release it. The value of LockTimeout shall be a duration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lock Timeout</em>' attribute.
	 * @see #setLockTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataService_LockTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLockTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataService#getLockTimeout <em>Lock Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Timeout</em>' attribute.
	 * @see #getLockTimeout()
	 * @generated
	 */
	void setLockTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Max Create Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxCreateSize shall contain the maximum value that the implementation will currently accept in the MaxSize property of the OpaqueManagementDataTemplate embedded instance parameter in a call to Create(). This value may change over time for any reason, including but not limited to fragmentation of the storage resources managed by the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Create Size</em>' attribute.
	 * @see #setMaxCreateSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OpaqueManagementDataService_MaxCreateSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_OpaqueManagementData.MaxSize\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxCreateSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OpaqueManagementDataService#getMaxCreateSize <em>Max Create Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Create Size</em>' attribute.
	 * @see #getMaxCreateSize()
	 * @generated
	 */
	void setMaxCreateSize(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grants or removes access to the referenced CIM_OpaqueManagementData instance by the referenced CIM_Identity instance.
	 * @param Identity Reference to the CIM_Identity instance that is the subject of the access rights modified by this method.
	 * @param OpaqueManagementData Reference to the CIM_OpaqueManagementData instance that is the target of the access rights modified by this method.
	 * @param Activities The subset of values from the value map that shall be contained in the resulting Activities property of the CIM_AssociatedPrivilege between the CIM_Identity instance referenced by the Identity parameter and the CIM_OpaqueManagementData instance referenced by the OpaqueManagementData parameter. If such an instance of CIM_AssociatedPrivilege does not exist before the method is invoked, the method shall create it.
	 * <!-- end-model-doc -->
	 * @model IdentityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF' Required='true' In='true'" OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'" ActivitiesUnique="false" ActivitiesMany="true"
	 *        ActivitiesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Required='true' In='true' ValueMap='[\"5\",\"6\"]' Values='[\"Read\",\"Write\"]' ModelCorrespondence='[\"CIM_AssociatedPrivilege.Activities\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long AssignAccess(CIM_Identity Identity, CIM_OpaqueManagementData OpaqueManagementData, EList<Integer> Activities);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create() creates an instance of CIM_OpaqueManagementData using the property values in the OpaqueManagementData parameter, and allocates the number of bytes of storage specified in the MaxSize property of the OpaqueManagementData parameter. It also optionally allows the client to specify an existing CIM_StorageExtent instance as the basis (storage location) of the new CIM_OpaqueManagementData instance.
	 * @param MaxSize The requested value of the MaxSize property in the CIM_OpaqueManagementData instance created by this method. The actual property value shall not be less than this value.
	 * @param DataFormat The value of the DataFormat property in the CIM_OpaqueManagementData instance created by this method.
	 * @param ElementName The value of the ElementName property in the CIM_OpaqueManagementData instance created by this method.
	 * @param Owner Specifies the instance of CIM_Identity or its subclass that shall be the owner of the new CIM_OpaqueManagementData instance. Create() shall associate the new CIM_OpaqueManagementData instance with this CIM_Identity instance using a new instance of CIM_AssociatedPrivilege.
	 * @param BasedOnExtent Specifies the instance of CIM_StorageExtent on which the new instance of CIM_OpaqueManagementData shall be based (i.e., in which it shall be stored). If this parameter is NULL, the choice of storage location shall be left to the implementation.
	 * @param OpaqueManagementData Reference to the instance of CIM_OpaqueManagementData created when the method returns a value of 0.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model MaxSizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementData.MaxSize\"]'" DataFormatAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementData.DataFormat\"]'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementData.ElementName\"]'" OwnerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF' Required='true' In='true'" BasedOnExtentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF' In='true'" OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' In='false' Out='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long Create(Long MaxSize, String DataFormat, String ElementName, CIM_Identity Owner, CIM_StorageExtent BasedOnExtent, CIM_OpaqueManagementData OpaqueManagementData, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExportToURI() copies all or some of the bytes of opaque management data in the extent represented by the referenced instance of CIM_OpaqueManagementData to the Uniform Resource Identifier (URI) specified in the ExportURI parameter. The URI scheme implies the protocol that shall be used. Typically, the URI will be a Uniform Resource Locator (URL), but a Uniform Resource Name (URN) is not prohibited.
	 * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob shall be started to to perform the operation. The Job's reference shall be returned in the output parameter Job.
	 * @param OpaqueManagementData The CIM_OpaqueManagementData instance that represents the extent that is the target of the operation.
	 * @param Offset Offset specifies the byte offset at which to start reading.
	 * @param Length On entry, Length contains the number of bytes to be read, starting at the byte offset in the Offset property. On return, Length contains the number of bytes that were actually read.
	 * @param ExportURI On entry, ExportURI contains a URI based on RFC 3986 that indicates the location to which the service shall copy the specified bytes of opaque management data and from which the client subsequently retrieves them.
	 * @param LockToken A token that represents a Lock placed on the data in the extent referenced by the OpaqueManagementData parameter, using the Lock() method.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'" OffsetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' PUnit='byte'" LengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' Out='true' PUnit='byte'" ExportURIAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementDataCapabilities.SupportedExportURISchemes\"]'" LockTokenUnique="false" LockTokenMany="true"
	 *        LockTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true' Octetstring='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ExportToURI(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, String ExportURI, EList<Integer> LockToken, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImportFromURI() modifies all or some of the bytes in the referenced instance of CIM_OpaqueManagementData. The imported data for the operation is copied from the URI specified in the ImportURI parameter. The URI scheme implies the protocol that shall be used. Typically, the URI will be a Uniform Resource Locator (URL), but a Uniform Resource Name (URN) is not prohibited.
	 * Any data already present in the instance outside the range specified by Offset and Length is unchanged.
	 * If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob shall be started to perform the operation. The Job's reference shall be returned in the output parameter Job.
	 * @param OpaqueManagementData The CIM_OpaqueManagementData instance that represents the extent that is the target of the operation.
	 * @param Offset Offset specifies the byte offset at which to start writing.
	 * @param Length On entry, Length contains the number of bytes to be written, starting at the byte offset in the Offset. property. On return, Length contains the number of bytes that were actually written.
	 * @param Truncate If the value of the DataSize property of the instance referenced by the OpaqueManagementData parameter is greater than Offset + Length, then a value of TRUE shall indicate that the DataSize property value shall be reduced by this operation to Offset + Length, and a value of FALSE shall indicate that the DataSize property value shall remain unchanged by this operation. If the value of the DataSize property is not greater than Offset + Length, then this parameter shall be ignored.
	 * @param ImportURI On entry, ImportURI contains a URI based on RFC 3986 that shall be used by the service to retrieve the bytes of opaque management data to be written into the extent represented by the OpaqueManagementData parameter.
	 * @param LockToken A token that represents a Lock placed on the data in the extent referenced by the OpaqueManagementData parameter, using the Lock() method.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'" OffsetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' PUnit='byte'" LengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' Out='true' PUnit='byte'" TruncateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementData.DataSize\"]'" ImportURIAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementDataCapabilities.SupportedImportURISchemes\"]'" LockTokenUnique="false" LockTokenMany="true"
	 *        LockTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true' Octetstring='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ImportFromURI(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, Boolean Truncate, String ImportURI, EList<Integer> LockToken, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lock() allows a management client to atomically read or write an opaque management data storage extent larger than MaxReadLength or MaxWriteLength, respectively. A server that supports this method shall support the following pattern:
	 * 1. Issue Lock() with Lock set to true to lock the CIM_OpaqueManagementData instance.
	 * 2. Repeat Read() or Write() as many times as necessary to complete the transfer
	 * 3. Issue Lock() with Lock set to false to unlock the CIM_OpaqueManagementData instance
	 * If Lock() with Lock set to true completes successfully, the server shall return a LockToken to the client. Until the lock is removed or expires, the server shall deny OpaqueManagementDataService method requests on the same CIM_OpaqueManagementData instance that do not contain the same LockToken value.
	 * Lock() shall not lock the properties of the OpaqueManagementData instance. The method shall return 0 if successful, 1 if not supported, and any other value if an error occurred.
	 * @param OpaqueManagementData The CIM_OpaqueManagementData instance that represents the extent that is the target of the operation.
	 * @param Lock If true, lock the data from access by another management client. If false, release the data.
	 * @param LockToken A token that shall be returned to the client as output if Lock is True, and supplied by the client as input if Lock is False. In this way, only the client that set the Lock may remove it or delegate such responsibility to another client.
	 * <!-- end-model-doc -->
	 * @model OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'" LockAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true' In='true'" LockTokenUnique="false" LockTokenMany="true"
	 *        LockTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true' Out='true' Octetstring='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long Lock(CIM_OpaqueManagementData OpaqueManagementData, Boolean Lock, EList<Integer> LockToken);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read() returns all or some of the bytes of opaque management data in the extent represented by the referenced instance of CIM_OpaqueManagementData.
	 * @param OpaqueManagementData The CIM_OpaqueManagementData instance that represents the extent that is the target of the operation.
	 * @param Offset Offset specifies the byte offset at which to start reading.
	 * @param Length On entry, Length shall contain the number of bytes to be read, starting at the byte offset in the Offset property. On return, Length shall contain the number of bytes that were actually read.
	 * @param Data On return, Data shall contain the bytes of opaque management data read from the extent represented by the OpaqueManagementData parameter.
	 * @param LockToken A token that represents a Lock placed on the data in the extent referenced by the OpaqueManagementData parameter, using the Lock() method. Parameter shall be NULL if data is not locked.
	 * <!-- end-model-doc -->
	 * @model OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'" OffsetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' PUnit='byte'" LengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' Out='true' ModelCorrespondence='[\"CIM_OpaqueManagementDataCapabilities.MaxReadLength\"]' PUnit='byte'" DataUnique="false" DataMany="true"
	 *        DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='false' Out='true' Octetstring='true'" LockTokenUnique="false" LockTokenMany="true"
	 *        LockTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true' Octetstring='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long Read(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, EList<Integer> Data, EList<Integer> LockToken);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Transfers ownership of a CIM_OpaqueManagementData instance to the CIM_Identity instance referenced by the Identity parameter.
	 * @param NewOwner Reference to the CIM_Identity instance that will become the new owner of the CIM_OpaqueManagementData instance referenced by the OpaqueManagementData parameter.
	 * @param OpaqueManagementData Reference to the CIM_OpaqueManagementData instance that is the target of ownership reassignment.
	 * <!-- end-model-doc -->
	 * @model NewOwnerAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF' Required='true' In='true'" OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long ReassignOwnership(CIM_Identity NewOwner, CIM_OpaqueManagementData OpaqueManagementData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Write() modifies all or some of the bytes in the extent represented by the referenced instance of CIM_OpaqueManagementData. Any data already present in the extent outside the range specified by Offset and Length shall remain unchanged by this operation.
	 * @param OpaqueManagementData The CIM_OpaqueManagementData instance that represents the extent that is the target of the operation.
	 * @param Offset Offset specifies the byte offset at which to start writing.
	 * @param Length On entry, Length contains the number of bytes to be written, starting at the byte offset in the Offset. property. On return, Length contains the number of bytes that were actually written.
	 * @param Truncate If the value of the DataSize property of the instance referenced by the OpaqueManagementData parameter is greater than Offset + Length, then a value of TRUE shall indicate that the DataSize property value shall be reduced by this operation to Offset + Length, and a value of FALSE shall indicate that the DataSize property value shall remain unchanged by this operation. If the value of the DataSize property is not greater than Offset + Length, then this parameter shall be ignored.
	 * @param Data On entry, Data contains the bytes of opaque management data to be written into the extent represented by the OpaqueManagementData parameter.
	 * @param LockToken A token that represents a Lock placed on the data in the extent referenced by the OpaqueManagementData parameter, using the Lock() method.
	 * @param Job Reference to the job (may be null if job completed).
	 * <!-- end-model-doc -->
	 * @model OpaqueManagementDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OpaqueManagementData REF' Required='true' In='true'" OffsetAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' PUnit='byte'" LengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' In='true' Out='true' ModelCorrespondence='[\"CIM_OpaqueManagementDataCapabilities.MaxWriteLength\"]' PUnit='byte'" TruncateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true' ModelCorrespondence='[\"CIM_OpaqueManagementData.DataSize\"]'" DataUnique="false" DataMany="true"
	 *        DataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Required='true' In='true' Octetstring='true'" LockTokenUnique="false" LockTokenMany="true"
	 *        LockTokenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true' Octetstring='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3..4095\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	Long Write(CIM_OpaqueManagementData OpaqueManagementData, Long Offset, Long Length, Boolean Truncate, EList<Integer> Data, EList<Integer> LockToken, CIM_ConcreteJob Job);

} // CIM_OpaqueManagementDataService
