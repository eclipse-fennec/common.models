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
 * A representation of the model object '<em><b>CIM Database Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Databases are comprised of a collection of logical storage areas that are represented by instances of the DatabaseStorageArea class. The DatabaseStorage class represents the relationship between a CommonDatabase and the storage areas that it uses.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseStorage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::Database::Storage' override.GroupComponent='CIM_CommonDatabase REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Min='1' override.GroupComponent.Max='1' override.GroupComponent.Description='The database that makes use of the associated DatabaseStorageArea.' override.PartComponent='CIM_DatabaseStorageArea REF' override.PartComponent.Description='A DatabaseStorageArea that is used by the associated CommonDatabase. A DatabaseStorageArea must only be used by a single database.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseStorage extends CIM_Component {
} // CIM_DatabaseStorage
