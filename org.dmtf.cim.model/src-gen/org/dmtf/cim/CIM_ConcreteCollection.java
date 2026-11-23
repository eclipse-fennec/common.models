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
 * A representation of the model object '<em><b>CIM Concrete Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete version of Collection. This class represents a generic and instantiable collection, such as a group of ComputerSystems (for example, a pool of hosts available for executing jobs). It is defined as a concrete subclass of the abstract CIM_Collection class, to be used in place of many specific subclasses that add no semantics. Note that when defining additional semantics for Collection, this class must not be subclassed. Specific semantics continue to be defined as subclasses of the abstract CIM_Collection. ConcreteCollection is limited in its use as a concrete form of a general collection or bag. It was deemed more prudent to create this concrete subclass than to change Collection from an abstract to a concrete class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Core::Collection' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; must include a unique name. It can be a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID. Or, it could be a registered ID that is assigned to the business entity by a recognized global authority.(This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; must not contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n\n&lt;LocalID&gt; is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity must ensure that the resulting InstanceID is not re-used as any of the InstanceIDs produced by this or other providers for the NameSpace of this instance.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ConcreteCollection extends CIM_Collection {
} // CIM_ConcreteCollection
