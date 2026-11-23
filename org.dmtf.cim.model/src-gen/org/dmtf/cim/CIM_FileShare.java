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
 * A representation of the model object '<em><b>CIM File Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FileShare is representative of a LogicalFile presented for use (or shared) across systems. Instances of FileShare are associated with the shared object on the 'server'-side via the CIM_SharedElement association. Shares are attached on the 'client'-side (usually into another namespace) via the CIM_ImportedShare association. FileShare is Abstract to force subclassing to define the semantics of the file-sharing protocol. FileShare when used for importing deprecates RemoteFileSystem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileShare#getSharingDirectory <em>Sharing Directory</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileShare()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::System::FileElements' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileShare extends CIM_Share {
	/**
	 * Returns the value of the '<em><b>Sharing Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a directory or file is presented for use (or shared) across systems. A value of true represents a directory. A value of false represents a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sharing Directory</em>' attribute.
	 * @see #setSharingDirectory(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileShare_SharingDirectory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSharingDirectory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileShare#getSharingDirectory <em>Sharing Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharing Directory</em>' attribute.
	 * @see #getSharingDirectory()
	 * @generated
	 */
	void setSharingDirectory(Boolean value);

} // CIM_FileShare
