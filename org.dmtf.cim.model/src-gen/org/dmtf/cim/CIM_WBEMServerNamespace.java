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
 * A representation of the model object '<em><b>CIM WBEM Server Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_WBEMServerNamespace represents a namespace in a WBEM Server. A namespace provides a scope of uniqueness for some types of object. Specifically, the names of class objects and of qualifier type objects shall be unique in a namespace. The compound key of instance objects shall be unique across all instances of the class (not including subclasses) within the namespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_WBEMServerNamespace#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_WBEMServerNamespace#getSchemaInformation <em>Schema Information</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServerNamespace()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Interop::WBEMServer' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID is an optional property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace. Various subclasses of this class may override this property to make it required, or a key. Such subclasses may also modify the preferred algorithms for ensuring uniqueness that are defined below.\nTo ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If not null and the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nIf not set to null for DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_WBEMServerNamespace extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The namespace name. The namespace name shall be unique within the WBEM Server. Note: Namespaces are flat (not hierarchical). If the slash character is used, it is treated as any other character and has no additional meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServerNamespace_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_WBEMServerNamespace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Information</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The information for each schema in this namespace. There should be one instance for each schema in the namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Information</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_WBEMServerNamespace_SchemaInformation()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' EmbeddedInstance='CIM_SchemaInformationStructure'"
	 * @generated
	 */
	EList<String> getSchemaInformation();

} // CIM_WBEMServerNamespace
