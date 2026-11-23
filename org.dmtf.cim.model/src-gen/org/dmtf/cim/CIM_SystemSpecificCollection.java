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
 * A representation of the model object '<em><b>CIM System Specific Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SystemSpecificCollection represents the general concept of a collection that is scoped (or contained) by a System. It represents a Collection that has meaning only in the context of a System, a Collection whose elements are restricted by the definition of the System, or both of these types of Collections. This meaning is explicitly described by the (required) association, HostedCollection. 
 * An example of a SystemSpecificCollection is a Fibre Channel zone that collects network ports, port groupings, and aliases (as required by a customer) in the context of an AdminDomain. The Collection is not a part of the domain, but merely an arbitrary grouping of the devices and other Collections in the domain. In other words, the context of the Collection is restricted to the domain, and its members are also limited by the domain.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemSpecificCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Core::Collection' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; must include a unique name. It can be a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID. Or, it could be a registered ID that is assigned to the business entity by a recognized global authority.(This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; must not contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity must ensure that the resulting InstanceID is not re-used as any of InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \'preferred\' algorithm must be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SystemSpecificCollection extends CIM_Collection {
} // CIM_SystemSpecificCollection
