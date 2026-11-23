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
 * A representation of the model object '<em><b>CIM NFS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from RemoteFileSystem representing that the FileSystem is mounted, using the NFS protocol, from a ComputerSystem. The properties of the NFS object deal with the operational aspects of the mount and represent the client-side configuration for NFS access. The FileSystemType (inherited from FileSystem) should be set to indicate the type of this FileSystem as it appears to the client.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getHardMount <em>Hard Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getForegroundMount <em>Foreground Mount</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getInterrupt <em>Interrupt</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getMountFailureRetries <em>Mount Failure Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getRetransmissionAttempts <em>Retransmission Attempts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getRetransmissionTimeout <em>Retransmission Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getReadBufferSize <em>Read Buffer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getWriteBufferSize <em>Write Buffer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getServerCommunicationPort <em>Server Communication Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getAttributeCaching <em>Attribute Caching</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForRegularFilesMin <em>Attribute Caching For Regular Files Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForRegularFilesMax <em>Attribute Caching For Regular Files Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForDirectoriesMin <em>Attribute Caching For Directories Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForDirectoriesMax <em>Attribute Caching For Directories Max</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NFS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::FileElements' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_NFS extends CIM_RemoteFileSystem {
	/**
	 * Returns the value of the '<em><b>Hard Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true: Once the FileSystem is mounted, NFS requests are retried until the hosting System responds. 
	 * If set to false: Once the FileSystem is mounted, an error is returned if the hosting System does not respond.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hard Mount</em>' attribute.
	 * @see #setHardMount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_HardMount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getHardMount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getHardMount <em>Hard Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hard Mount</em>' attribute.
	 * @see #getHardMount()
	 * @generated
	 */
	void setHardMount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Foreground Mount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true: Retries are performed in the foreground. 
	 * If set to false: If the first mount attempt fails, retries are performed in the background.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Foreground Mount</em>' attribute.
	 * @see #setForegroundMount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_ForegroundMount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getForegroundMount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getForegroundMount <em>Foreground Mount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Mount</em>' attribute.
	 * @see #getForegroundMount()
	 * @generated
	 */
	void setForegroundMount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Interrupt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true: Interrupts are permitted for hard mounts. 
	 * If set to false : Interrupts are ignored for hard mounts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupt</em>' attribute.
	 * @see #setInterrupt(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_Interrupt()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getInterrupt();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getInterrupt <em>Interrupt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt</em>' attribute.
	 * @see #getInterrupt()
	 * @generated
	 */
	void setInterrupt(Boolean value);

	/**
	 * Returns the value of the '<em><b>Mount Failure Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of mount failure retries allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mount Failure Retries</em>' attribute.
	 * @see #setMountFailureRetries(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_MountFailureRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMountFailureRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getMountFailureRetries <em>Mount Failure Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Failure Retries</em>' attribute.
	 * @see #getMountFailureRetries()
	 * @generated
	 */
	void setMountFailureRetries(Integer value);

	/**
	 * Returns the value of the '<em><b>Retransmission Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of NFS retransmissions allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retransmission Attempts</em>' attribute.
	 * @see #setRetransmissionAttempts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_RetransmissionAttempts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRetransmissionAttempts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getRetransmissionAttempts <em>Retransmission Attempts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retransmission Attempts</em>' attribute.
	 * @see #getRetransmissionAttempts()
	 * @generated
	 */
	void setRetransmissionAttempts(Integer value);

	/**
	 * Returns the value of the '<em><b>Retransmission Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NFS timeout in tenths of a second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retransmission Timeout</em>' attribute.
	 * @see #setRetransmissionTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_RetransmissionTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Tenths of Seconds'"
	 * @generated
	 */
	Long getRetransmissionTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getRetransmissionTimeout <em>Retransmission Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retransmission Timeout</em>' attribute.
	 * @see #getRetransmissionTimeout()
	 * @generated
	 */
	void setRetransmissionTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Read Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read buffer size in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Buffer Size</em>' attribute.
	 * @see #setReadBufferSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_ReadBufferSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes'"
	 * @generated
	 */
	Long getReadBufferSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getReadBufferSize <em>Read Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Buffer Size</em>' attribute.
	 * @see #getReadBufferSize()
	 * @generated
	 */
	void setReadBufferSize(Long value);

	/**
	 * Returns the value of the '<em><b>Write Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Write buffer size in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Buffer Size</em>' attribute.
	 * @see #setWriteBufferSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_WriteBufferSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes'"
	 * @generated
	 */
	Long getWriteBufferSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getWriteBufferSize <em>Write Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Buffer Size</em>' attribute.
	 * @see #getWriteBufferSize()
	 * @generated
	 */
	void setWriteBufferSize(Long value);

	/**
	 * Returns the value of the '<em><b>Server Communication Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remote ComputerSystem's (ie, the NFS File 'Server's) UDP port number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server Communication Port</em>' attribute.
	 * @see #setServerCommunicationPort(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_ServerCommunicationPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getServerCommunicationPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getServerCommunicationPort <em>Server Communication Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Communication Port</em>' attribute.
	 * @see #getServerCommunicationPort()
	 * @generated
	 */
	void setServerCommunicationPort(Long value);

	/**
	 * Returns the value of the '<em><b>Attribute Caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true: Control attribute caching is enabled. 
	 * If set to false: Control attribute caching is disabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching</em>' attribute.
	 * @see #setAttributeCaching(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_AttributeCaching()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAttributeCaching();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getAttributeCaching <em>Attribute Caching</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Caching</em>' attribute.
	 * @see #getAttributeCaching()
	 * @generated
	 */
	void setAttributeCaching(Boolean value);

	/**
	 * Returns the value of the '<em><b>Attribute Caching For Regular Files Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of seconds that cached attributes are held after file modification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching For Regular Files Min</em>' attribute.
	 * @see #setAttributeCachingForRegularFilesMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_AttributeCachingForRegularFilesMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds'"
	 * @generated
	 */
	Integer getAttributeCachingForRegularFilesMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForRegularFilesMin <em>Attribute Caching For Regular Files Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Caching For Regular Files Min</em>' attribute.
	 * @see #getAttributeCachingForRegularFilesMin()
	 * @generated
	 */
	void setAttributeCachingForRegularFilesMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Attribute Caching For Regular Files Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of seconds that cached attributes are held after file modification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching For Regular Files Max</em>' attribute.
	 * @see #setAttributeCachingForRegularFilesMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_AttributeCachingForRegularFilesMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds'"
	 * @generated
	 */
	Integer getAttributeCachingForRegularFilesMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForRegularFilesMax <em>Attribute Caching For Regular Files Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Caching For Regular Files Max</em>' attribute.
	 * @see #getAttributeCachingForRegularFilesMax()
	 * @generated
	 */
	void setAttributeCachingForRegularFilesMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Attribute Caching For Directories Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of seconds that cached attributes are held after directory update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching For Directories Min</em>' attribute.
	 * @see #setAttributeCachingForDirectoriesMin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_AttributeCachingForDirectoriesMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds'"
	 * @generated
	 */
	Integer getAttributeCachingForDirectoriesMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForDirectoriesMin <em>Attribute Caching For Directories Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Caching For Directories Min</em>' attribute.
	 * @see #getAttributeCachingForDirectoriesMin()
	 * @generated
	 */
	void setAttributeCachingForDirectoriesMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Attribute Caching For Directories Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of seconds that cached attributes are held after directory update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Caching For Directories Max</em>' attribute.
	 * @see #setAttributeCachingForDirectoriesMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NFS_AttributeCachingForDirectoriesMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds'"
	 * @generated
	 */
	Integer getAttributeCachingForDirectoriesMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NFS#getAttributeCachingForDirectoriesMax <em>Attribute Caching For Directories Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Caching For Directories Max</em>' attribute.
	 * @see #getAttributeCachingForDirectoriesMax()
	 * @generated
	 */
	void setAttributeCachingForDirectoriesMax(Integer value);

} // CIM_NFS
