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
 * A representation of the model object '<em><b>CIM Remote Replication Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A RemoteReplicationCollection collects all paths (for example, ProtocolEndpoints) that provide access to a remote system for replication operations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getDeleteOnUnassociated <em>Delete On Unassociated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getHardwareCompressionEnabled <em>Hardware Compression Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getSoftwareCompressionEnabled <em>Software Compression Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RemoteReplicationCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.ElementName='string' override.ElementName.Write='true' override.ElementName.Description='A user-friendly name for the RemoteReplicationCollection.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RemoteReplicationCollection extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this RemoteReplicationCollection is currently active and allows replication traffic to/from remote elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteReplicationCollection_Active()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delete On Unassociated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance of RemoteReplicationCollection will be deleted when it is no longer associated with an access point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Unassociated</em>' attribute.
	 * @see #setDeleteOnUnassociated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteReplicationCollection_DeleteOnUnassociated()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnUnassociated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getDeleteOnUnassociated <em>Delete On Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Unassociated</em>' attribute.
	 * @see #getDeleteOnUnassociated()
	 * @generated
	 */
	void setDeleteOnUnassociated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hardware Compression Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property indicates if hardware compression is enabled -- the transmitted/received data is compressed by hardware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Compression Enabled</em>' attribute.
	 * @see #setHardwareCompressionEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteReplicationCollection_HardwareCompressionEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getHardwareCompressionEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getHardwareCompressionEnabled <em>Hardware Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Compression Enabled</em>' attribute.
	 * @see #getHardwareCompressionEnabled()
	 * @generated
	 */
	void setHardwareCompressionEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Software Compression Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property indicates if software compression is enabled -- the transmitted/received data is compressed by sofware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software Compression Enabled</em>' attribute.
	 * @see #setSoftwareCompressionEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RemoteReplicationCollection_SoftwareCompressionEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getSoftwareCompressionEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RemoteReplicationCollection#getSoftwareCompressionEnabled <em>Software Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Compression Enabled</em>' attribute.
	 * @see #getSoftwareCompressionEnabled()
	 * @generated
	 */
	void setSoftwareCompressionEnabled(Boolean value);

} // CIM_RemoteReplicationCollection
