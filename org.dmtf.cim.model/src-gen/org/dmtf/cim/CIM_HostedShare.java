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
 * A representation of the model object '<em><b>CIM Hosted Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_HostedShare is an association between a Share and the System on which the functionality resides. The cardinality of this association is many-to-many but a FileShare must have at least 1 host system, either exporting or importing it. (A System may host many Shares and a Share may be hosted by more than one System, but a Share must have at least one HostedShare). 
 * Heuristic: For export, a Share is hosted on the System where the LogicalElement that is exported by the Share is located (via SharedElement, derived from LogicalIdentity). For import, a Share is hosted on the System where the LogicalFile (or other namespace element) that provides the mount-point for the share is located (via ImportedShare, derived from LogicalIdentity).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_HostedShare#getRemoteShareWWN <em>Remote Share WWN</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedShare()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.43.0' UMLPackagePath='CIM::System::FileElements' override.Antecedent='CIM_System REF' override.Antecedent.Key='true' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The hosting System.' override.Dependent='CIM_Share REF' override.Dependent.Key='true' override.Dependent.Description='The Share hosted on the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedShare extends CIM_HostedDependency {
	/**
	 * Returns the value of the '<em><b>Remote Share WWN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that uniquely identifies the remote element (expected to be an ExportedFileShare) that the Dependent Share represents if this is an imported Share. This is an opaque, unique identifier that provides an unambiguous name for the remote share -- we expect that it will be a WWN but any other interoperable format (e.g., a URI) would also work.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Share WWN</em>' attribute.
	 * @see #setRemoteShareWWN(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_HostedShare_RemoteShareWWN()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRemoteShareWWN();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_HostedShare#getRemoteShareWWN <em>Remote Share WWN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Share WWN</em>' attribute.
	 * @see #getRemoteShareWWN()
	 * @generated
	 */
	void setRemoteShareWWN(String value);

} // CIM_HostedShare
