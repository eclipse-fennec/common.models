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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PRS_Reference is a placeholder to support links between PRS_Expression objects and a PRS_Solution. It does not have any properties. A 'Reference' Solution uses PRS_Statement objects to describe general, non-diagnostic knowledge and may not include any PRS_Problem and PRS_Resolution instances.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Reference()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Reference extends PRS_SolutionElement {
} // PRS_Reference
